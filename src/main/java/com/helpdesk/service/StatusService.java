package com.helpdesk.service;

import com.helpdesk.model.Status;

import java.util.List;


public interface StatusService {
    List<Status> findAll();
}
