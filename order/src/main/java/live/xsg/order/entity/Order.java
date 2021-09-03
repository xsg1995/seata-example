package live.xsg.order.entity;//JPA实体类

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`order`") //对应order表
public class Order {
    @Id
    @Column(name = "order_id")
    private Integer id; //订单编号
    private Integer memberId; //会员编号
    @Column(name = "goods_id")
    private Integer goodsId; //商品编号
    private Integer quantity; //销售数量

    public Order() {
    }

    public Order(int id, int memberId, int goodsId, int quantity) {
        this.id = id;
        this.memberId = memberId;
        this.goodsId = goodsId;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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
