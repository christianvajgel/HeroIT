package com.heroit.heroit;

import com.heroit.heroit.model.Hero;
import com.heroit.heroit.model.Power;
import com.heroit.heroit.model.Universe;
import com.heroit.heroit.repository.HeroJDBCRepository;
import com.heroit.heroit.repository.PowerJDBCRepository;
import com.heroit.heroit.repository.UniverseJDBCRepository;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HeroJDBCRepository heroRepository;
    @Autowired
    private PowerJDBCRepository powerRepository;
    @Autowired
    private UniverseJDBCRepository universeRepository;

    @PostMapping("/")
    public void saveHero(Hero hero){
        heroRepository.insert(new Hero(hero.getHeroName(),hero.getPower(),hero.getUniverse(),hero.getCreationDate()));
    }

    @Override
    public void run(String... args) throws Exception {

//        logger.info("Inserting -> {}", heroRepository.insert(new Hero("Hero 4", "Power 4", "Universe 4", "14/03/2020")));
//        logger.info("Inserting -> {}", heroRepository.insert(new Hero("Hero 5", "Power 5", "Universe 5", "14/03/2020")));
//        logger.info("Inserting -> {}", heroRepository.insert(new Hero("Hero 6", "Power 6", "Universe 6", "14/03/2020")));
//        logger.info("Inserting -> {}", heroRepository.insert(new Hero("Hero 7", "Power 7", "Universe 7", "14/03/2020")));
//        logger.info("Inserting -> {}", heroRepository.insert(new Hero("Hero 8", "Power 8", "Universe 8", "14/03/2020")));
//        logger.info("Inserting -> {}", heroRepository.insert(new Hero("Hero 9", "Power 9", "Universe 9", "14/03/2020")));
//        logger.info("Inserting -> {}", heroRepository.insert(new Hero("Hero 10", "Power 10", "Universe 10", "14/03/2020")));
//        logger.info("Inserting -> {}", heroRepository.insert(new Hero(2,"S2","P2","U2","13/03/2020")));

//        logger.info("Update 1 -> {}", heroRepository.update(new Hero(1, "Hero 1", "Power 1", "Universe 1", "14/03/2020")));
//        logger.info("Update 1 -> {}", heroRepository.update(new Hero(2, "Hero 2", "Power 2", "Universe 2", "14/03/2020")));

//        logger.info("Inserting -> {}", powerRepository.insert(new Power("Code completion")));
//        logger.info("Inserting -> {}", powerRepository.insert(new Power("Coffee deploy")));
//        logger.info("Inserting -> {}", powerRepository.insert(new Power("Double braces")));
//        logger.info("Inserting -> {}", powerRepository.insert(new Power("Find lost flash drive")));
//        logger.info("Inserting -> {}", powerRepository.insert(new Power("Locate open functions")));
//        logger.info("Inserting -> {}", powerRepository.insert(new Power("Quick printer fix")));
//
//        logger.info("Inserting -> {}", universeRepository.insert(new Universe("EY Comics")));
//        logger.info("Inserting -> {}", universeRepository.insert(new Universe("Trainee Comics")));
//        logger.info("Inserting -> {}", universeRepository.insert(new Universe("Others")));


//        logger.info("Inserting -> {}", heroRepository.insert(new Hero("Hero 4", "Power 4", "Universe 4", "14/03/2020")));
//        logger.info("Inserting -> {}", universeRepository.insert(new Universe("UNIVERSE")));

//        logger.info("Update 1 -> {}", heroRepository.insert(new Hero("SUPER", "POWER", "UNIVERSE", "15/03/2020")));
        logger.info("Delete/Update 2 -> {}", heroRepository.deleteById(2));

        logger.info("All heroes -> {}", heroRepository.findAll().size());
        logger.info("All powers -> {}", powerRepository.findAll());
        logger.info("All universes -> {}", universeRepository.findAll());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
