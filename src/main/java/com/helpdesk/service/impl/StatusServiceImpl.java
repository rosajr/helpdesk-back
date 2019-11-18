package com.helpdesk.service.impl;

import com.helpdesk.model.Status;
import com.helpdesk.repository.StatusRepository;
import com.helpdesk.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusRepository statusRepository;
    @Override
    public List<Status> findAll() {
        return statusRepository.findAll();
    }
}
