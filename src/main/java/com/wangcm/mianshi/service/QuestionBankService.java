package com.wangcm.mianshi.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wangcm.mianshi.model.dto.questionbank.QuestionBankQueryRequest;
import com.wangcm.mianshi.model.entity.QuestionBank;
import com.wangcm.mianshi.model.vo.QuestionBankVO;

import javax.servlet.http.HttpServletRequest;

/**
 * 题库服务
 *
 * @author <a href="https://github.com/wangcongmao">wangcm</a>
 * 
 */
public interface QuestionBankService extends IService<QuestionBank> {

    /**
     * 校验数据
     *
     * @param questionBank
     * @param add 对创建的数据进行校验
     */
    void validQuestionBank(QuestionBank questionBank, boolean add);

    /**
     * 获取查询条件
     *
     * @param questionBankQueryRequest
     * @return
     */
    QueryWrapper<QuestionBank> getQueryWrapper(QuestionBankQueryRequest questionBankQueryRequest);
    
    /**
     * 获取题库封装
     *
     * @param questionBank
     * @param request
     * @return
     */
    QuestionBankVO getQuestionBankVO(QuestionBank questionBank, HttpServletRequest request);

    /**
     * 分页获取题库封装
     *
     * @param questionBankPage
     * @param request
     * @return
     */
    Page<QuestionBankVO> getQuestionBankVOPage(Page<QuestionBank> questionBankPage, HttpServletRequest request);
}
