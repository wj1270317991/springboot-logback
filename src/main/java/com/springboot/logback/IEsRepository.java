package com.springboot.logback;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * com.springboot.logback
 * <strong>描述：</strong>
 * <strong>功能：</strong>
 * <strong>使用场景：</strong>
 * <strong>注意事项：</strong>
 *
 * @author: wangjun
 * @date: 2018/12/17.
 */
public interface IEsRepository extends ElasticsearchRepository<MoEsLog,String>{
}
