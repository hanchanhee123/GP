package gamepiece.admin.point.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import gamepiece.admin.point.domain.Point;

@Mapper
public interface PointshopMapper {
	List<Point> findAll();
	
}
