package com.alloiz.palma.server.service;

import com.alloiz.palma.server.model.Callback;

public interface MailService {

    Callback sendCallback (Callback callback);
}