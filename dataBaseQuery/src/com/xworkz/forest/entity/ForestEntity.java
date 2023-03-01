package com.xworkz.forest.entity;

import javax.persistence.Column;
import javax.persistence.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="forestinfo")
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="findAreaByName",query="select entity.area from ForestEntity entity where entity.name='Evergreen'")

@NamedQuery(name="findByName",query="select entity from ForestEntity entity where entity.name='gir forest'")

@NamedQuery(name="findByState",query="select entity from ForestEntity entity where entity.state='karnatak'")

@NamedQuery(name="findByNameAndStateAndArea",query="select entity from ForestEntity entity where entity.name='decidiousForest'&& entity.state='AP'&&entity.area='hariyan'")

@NamedQuery(name="findByNameAndState",query="select entity.area from ForestEntity entity where entity.name='Green'")
@NamedQuery(name="findNameById",query="select entity.area from ForestEntity entity where entity.name='vishu'")
@NamedQuery(name="findStateByNameAndArea",query="select entity.area from ForestEntity entity where entity.name='vishu'")
@NamedQuery(name="findCount",query="select count (entity) from ForestEntity entity")
@NamedQuery(name="findMaxArea",query="select max (entity.area) from ForestEntity entity")

public class ForestEntity {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;

	
	@Column(name="state")
	private String state;
	

	@Column(name="type")
	private String type;
	
	@Column(name="area")
	private Double area;


	

}
