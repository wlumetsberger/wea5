package wea5.shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import wea5.shop.warehouse.ArticleData;

public class ShoppingCart {
	
	private List<ArticleData> articles = new ArrayList<ArticleData>();
	private static final Logger logger = Logger.getLogger(ShoppingCart.class.getName());
	
	
	public void add(ArticleData article){
		logger.info("add to cart: " + article);
		articles.add(article);
	}
	
	public int size(){
		return articles.size();
	}

	public Iterator<ArticleData> getIterator(){
		return this.articles.iterator();
	}
	
	public Double getTotalSum(){
		double sum = 0.0;
		for(ArticleData article : articles){
			sum = sum + Double.parseDouble(article.getPrice());
		}
		return sum;
	}
	
	public boolean remove(ArticleData article){
		logger.info("remove article: "+ article);
		return articles.remove(article);
	}
	
	public boolean removeArticleWithId(String articleId){
		for(ArticleData data : articles){
			if(data.getId().equals(articleId)){
				return articles.remove(data);
			}
		}
		return false;
	}
}
