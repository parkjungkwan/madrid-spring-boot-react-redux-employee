package net.zerotodev.api.cloud.item.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import net.zerotodev.api.cloud.board.domain.Article;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @Component @Table(name = "items")
public class Item {
    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;
    @Column(name = "item_brand") @NotNull private String itemBrand;
    @Column(name = "item_name") @NotNull private String itemName;
    @Column(name = "item_color") @NotNull private String itemColor;
    @Column(name = "released_date") @NotNull private String releasedDate;
    @OneToMany(mappedBy = "item", fetch = FetchType.EAGER)
    private List<Article> articleList = new ArrayList<>();
}
