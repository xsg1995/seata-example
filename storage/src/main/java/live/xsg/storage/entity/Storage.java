package live.xsg.storage.entity;//JPA实体类

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`storage`") //对应order表
public class Storage {
    @Id
    @Column(name = "goods_id")
    private Integer goodsId; //商品编号
    private Integer quantity; //销售数量

    public Storage() {
    }

    public Storage(int goodsId, int quantity) {
        this.goodsId = goodsId;
        this.quantity = quantity;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
