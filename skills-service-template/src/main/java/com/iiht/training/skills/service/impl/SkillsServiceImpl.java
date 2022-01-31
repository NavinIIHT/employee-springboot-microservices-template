package com.iiht.training.skills.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.skills.dto.SkillsDto;
import com.iiht.training.skills.repository.SkillsRepository;
import com.iiht.training.skills.service.SkillsService;

@Service
public class SkillsServiceImpl implements SkillsService {

	@Autowired
	private SkillsRepository skillsRepository;

	@Override
	public SkillsDto addSkill(SkillsDto skillsDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SkillsDto updateSkill(SkillsDto skillsDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteSkill(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SkillsDto getSkillById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SkillsDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SkillsDto> skillsByEmployeeId(Integer emloyeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
