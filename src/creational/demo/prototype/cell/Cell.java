package creational.demo.prototype.cell;

import creational.demo.prototype.Prototype;

public interface Cell extends Prototype {
    default Cell split() {
        return (Cell) this.clone();
    }
}
