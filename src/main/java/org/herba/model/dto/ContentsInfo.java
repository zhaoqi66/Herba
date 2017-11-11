package org.herba.model.dto;

import java.util.List;

import org.herba.model.entity.Metas;
import org.herba.model.entity.Users;

import com.github.pagehelper.PageInfo;

import lombok.Data;

/**
 * ContentsInfo 文章或则页面的信息，无全部标签和分类信息
 *
 * @version        1.0
 * @author         Varshonwood
 * @date           17/11/11
 */
@Data
public class ContentsInfo {
    private Integer     cid;
    private String      title;
    private String      slug;
    private Integer     created;
    private Integer     modified;
    private Integer     order;
    private Integer     authorId;
    private String      template;
    private String      type;
    private String      status;
    private String      password;
    private Integer     commentsNum;
    private String      allowComment;
    private String      allowPing;
    private String      allowFeed;
    private Integer     parent;
    private Integer     viewsNum;
    private Integer     views;
    private String      text;
    private List<Metas> metas;
    private Users       users;

    /**
     * ContentsInfo
     */
    public ContentsInfo() {}
}
//~ Formatted by Jindent --- http://www.jindent.com
