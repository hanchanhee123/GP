package gamepiece.admin.point.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import gamepiece.admin.point.domain.Point;
import gamepiece.admin.point.domain.PointCategories;

@Mapper
public interface PointshopMapper {
	List<Point> findAll();
	
	List<PointCategories> findCate();
	
	List<Point> addPointShop();
}
