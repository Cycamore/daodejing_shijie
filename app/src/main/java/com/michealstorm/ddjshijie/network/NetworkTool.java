package com.michealstorm.ddjshijie.network;

import com.michealstorm.ddjshijie.bean.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Author       : Michealstorm@aliyun.com
 * Project Name ：DdjShijie
 * Created Time : 2017/10/20 9:00
 * Description  : //
 */
public class NetworkTool {
    public static List<Article> getArticlList() {

        ArrayList<Article> article_list = new ArrayList<>();
        article_list.add(new Article("第一章", "道可道，非常道，名可名，非常名。无名，天地之始，有名，万物之母。"));
        article_list.add(new Article("第二章", "道可道，非常道，名可名，非常名。无名，天地之始，有名，万物之母。"));
        article_list.add(new Article("第三章", "道可道，非常道，名可名，非常名。无名，天地之始，有名，万物之母。"));
        article_list.add(new Article("第四章", "道可道，非常道，名可名，非常名。无名，天地之始，有名，万物之母。"));
        article_list.add(new Article("第五章", "道可道，非常道，名可名，非常名。无名，天地之始，有名，万物之母。"));
        article_list.add(new Article("第六章", "道可道，非常道，名可名，非常名。无名，天地之始，有名，万物之母。"));

        return article_list;
    }

}
