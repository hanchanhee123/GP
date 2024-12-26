package gamepiece.admin.point.service;

import java.util.List;

import gamepiece.admin.point.domain.Point;
import gamepiece.admin.point.domain.PointCategories;

public interface PointService {
	List<Point> findAll();
	
	List<PointCategories> findCate();
}
