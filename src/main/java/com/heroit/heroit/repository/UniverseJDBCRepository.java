package com.heroit.heroit.repository;

import com.heroit.heroit.model.Universe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class UniverseJDBCRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class UniverseRowMapper implements RowMapper <Universe> {
        @Override
        public Universe mapRow(ResultSet rs, int rowNum) throws SQLException {
            Universe universe = new Universe();
            universe.setId(rs.getLong("id"));
            universe.setUniverse(rs.getString("universe"));
            return universe;
        }
    }

    public List <Universe> findAll() {
        return jdbcTemplate.query("select * from universes where deleted=0;", new UniverseRowMapper());
    }

    public Optional <Universe> findById(long id) {
        return Optional.of(jdbcTemplate.queryForObject("select * from universes where id=?", new Object[] {id}, new BeanPropertyRowMapper <Universe> (Universe.class)));
    }

    public int deleteById(long id) {
        return jdbcTemplate.update("delete from universes where id=?", new Object[] {id});
    }

    public int insert(Universe universe) {
        return jdbcTemplate.update("insert into universes (id, universe) " + "values(?, ?)", new Object[] {universe.getId(), universe.getUniverse()});
    }

    public int update(Universe universe) {
        return jdbcTemplate.update("update universes " + " set universe = ? " + " where id = ?", new Object[] {universe.getUniverse(), universe.getId()});
    }
}
