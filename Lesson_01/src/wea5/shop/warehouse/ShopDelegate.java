package wea5.shop.warehouse;

import java.util.List;

public interface ShopDelegate {
	
	public List<ArticleData> getAllArticles();
	public ArticleData getArticleById(String id);

}
