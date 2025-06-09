package com.wangcm.mianshi.esdao;

import com.wangcm.mianshi.model.dto.post.PostEsDTO;

import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
 * @author <a href="https://github.com/wangcongmao">wangcm</a>
 * @from <a href="https://github.com/wangcongmao"></a>
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}