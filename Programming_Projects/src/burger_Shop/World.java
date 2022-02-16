package burger_Shop;

import java.util.HashMap;
import java.util.List;

public class World {
	HashMap<Integer, Entity> entitys;
	public World() {
		entitys = new HashMap<Integer, Entity>();
	}
	public World(List<Entity> entityList) {
		for(Entity curEnt: entityList) {
			addEntitys(curEnt);
		}
	}
	public void addEntitys(Entity entity) {
		entitys.put(entity.getName().hashCode(), entity);
	}
	public HashMap<Integer, Entity> getEntitys() {
		return entitys;
	}
}
