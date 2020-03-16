package com.heroit.heroit.repository;

import java.util.List;
import java.util.Optional;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.heroit.heroit.model.Hero;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class HeroJDBCRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class HeroRowMapper implements RowMapper <Hero> {
        @Override
        public Hero mapRow(ResultSet rs, int rowNum) throws SQLException {
            Hero hero = new Hero();
            hero.setId(rs.getLong("id"));
            hero.setHeroName(rs.getString("heroName"));
            hero.setPower(rs.getString("power"));
            hero.setUniverse(rs.getString("universe"));
            hero.setCreationDate(rs.getString("creationDate"));
            return hero;
        }
    }

    public List <Hero> findAll() {
        return jdbcTemplate.query("select * from heroes where deleted=0;", new HeroRowMapper());
    }

    public Optional <Hero> findById(long id) {
        return Optional.of(jdbcTemplate.queryForObject("select * from heroes where id=?", new Object[] {id}, new BeanPropertyRowMapper <Hero> (Hero.class)));
    }

    public int deleteById(long id) {
        return jdbcTemplate.update("update heroes set deleted=1 where id=?", new Object[] {id});
    }

    public int insert(Hero hero) {
        return jdbcTemplate.update("insert into heroes (id, heroName, power, universe, creationDate) " + "values(?, ?, ?, ?,?)", new Object[] {hero.getId(), hero.getHeroName(), hero.getPower(), hero.getUniverse(), hero.getCreationDate()});
    }

    public int update(Hero hero) {
        return jdbcTemplate.update("update heroes " + " set heroName = ?, power = ?, universe = ?, creationDate = ? " + " where id = ?", new Object[] {hero.getHeroName(), hero.getPower(), hero.getUniverse(), hero.getCreationDate(), hero.getId()});
    }
}
