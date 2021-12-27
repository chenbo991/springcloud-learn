package com.xiangxue.jack.service;

import com.xiangxue.jack.bean.ConsultContent;
import com.xiangxue.jack.dao.CommonMapper;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Slf4j
@Service
public class UserServiceImpl implements UserService {

//	@Autowired
//	CommonMapper mapper;

	@Override
	public List<ConsultContent> queryContent() {
		ConsultContent bean = new ConsultContent();
		bean.setId(11);
		return Arrays.asList(bean);
	}
}
