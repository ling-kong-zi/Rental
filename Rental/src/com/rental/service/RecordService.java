package com.rental.service;

import java.util.ArrayList;
import java.util.List;

import com.rental.entity.Record;

public interface RecordService extends BaseService<Record>{
	long findTotalPage(int pagesize);
	List<Record> searchCarName(String record);

}
