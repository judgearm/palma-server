package com.alloiz.palma.server.service;

import com.alloiz.palma.server.model.Callback;

import java.util.List;

public interface CallbackService {

    Callback findOneAvailable(Long id);

    List<Callback> findAllAvailable();

    Callback findOne(Long id);

    List<Callback> findAll();

    Callback save(Callback callback);

    Callback update(Callback update);

    Boolean delete(Long id);
}
