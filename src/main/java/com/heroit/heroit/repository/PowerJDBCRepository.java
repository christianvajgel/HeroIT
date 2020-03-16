package com.heroit.heroit.repository;

import com.heroit.heroit.model.Power;
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
public class PowerJDBCRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class PowerRowMapper implements RowMapper <Power> {
        @Override
        public Power mapRow(ResultSet rs, int rowNum) throws SQLException {
            Power power = new Power();
            power.setId(rs.getLong("id"));
            power.setPower(rs.getString("power"));
            return power;
        }
    }

    public List <Power> findAll() {
        return jdbcTemplate.query("select * from powers where deleted=0;", new PowerRowMapper());
    }

    public Optional <Power> findById(long id) {
        return Optional.of(jdbcTemplate.queryForObject("select * from powers where id=?", new Object[] {id}, new BeanPropertyRowMapper <Power> (Power.class)));
    }

    public int deleteById(long id) {
        return jdbcTemplate.update("delete from powers where id=?", new Object[] {id});
    }

    public int insert(Power power) {
        return jdbcTemplate.update("insert into powers (id, power) " + "values(?, ?)", new Object[] {power.getId(), power.getPower()});
    }

    public int update(Power power) {
        return jdbcTemplate.update("update powers " + " set power = ? " + " where id = ?", new Object[] {power.getPower(), power.getId()});
    }
}
