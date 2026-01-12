package com.hibernate.ferreteria.repositorios;

import com.hibernate.ferreteria.entity.Articulos;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


public class Repo_Articulos implements JpaRepository<Articulos, Long> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Articulos> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Articulos> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Articulos> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Articulos getOne(Long aLong) {
        return null;
    }

    @Override
    public Articulos getById(Long aLong) {
        return null;
    }

    @Override
    public Articulos getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Articulos> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Articulos> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Articulos> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Articulos> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Articulos> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Articulos> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Articulos, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Articulos> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Articulos> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Articulos> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Articulos> findAll() {
        return List.of();
    }

    @Override
    public List<Articulos> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Articulos entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Articulos> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Articulos> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Articulos> findAll(Pageable pageable) {
        return null;
    }
}
