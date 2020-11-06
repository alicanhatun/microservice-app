package com.alican.service;

import com.alican.model.Ticket;

public interface TicketNotificationService {

    void sendToQueue(Ticket ticket);
}
