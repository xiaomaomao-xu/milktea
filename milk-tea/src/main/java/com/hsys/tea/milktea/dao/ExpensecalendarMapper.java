package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Expensecalendar;

public interface ExpensecalendarMapper {
    int deleteByPrimaryKey(Integer expenseId);

    int insert(Expensecalendar record);

    int insertSelective(Expensecalendar record);

    Expensecalendar selectByPrimaryKey(Integer expenseId);

    int updateByPrimaryKeySelective(Expensecalendar record);

    int updateByPrimaryKey(Expensecalendar record);
}