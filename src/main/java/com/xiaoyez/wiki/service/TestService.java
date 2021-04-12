package com.xiaoyez.wiki.service;

import com.xiaoyez.wiki.domain.Test;
import com.xiaoyez.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
//    @Autowired
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }

}
