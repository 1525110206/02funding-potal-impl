package com.javaweb.funding.potal.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.funding.bean.Member;
import com.javaweb.funding.bean.Ticket;
import com.javaweb.funding.potal.dao.TicketMapper;
import com.javaweb.funding.potal.service.TicketService;


@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	TicketMapper ticketMapper;

	@Override
	public Ticket getTicketByMemberId(Integer id) {
		return ticketMapper.getTicketByMemberId(id);
	}

	@Override
	public void saveTicket(Ticket ticket) {
		System.out.println(ticket);
		ticketMapper.saveTicket(ticket);
	}

	@Override
	public void updatePstep(Ticket ticket) {
		ticketMapper.updatePstep(ticket);
		
	}

	@Override
	public void updatePstepAndPiid(Ticket ticket) {
		ticketMapper.updatePstepAndPiid(ticket);
		
	}

	@Override
	public Member getMemberByPiid(String processInstanceId) {
		// TODO Auto-generated method stub
		return ticketMapper.getMemberByPiid(processInstanceId);
	}
}
