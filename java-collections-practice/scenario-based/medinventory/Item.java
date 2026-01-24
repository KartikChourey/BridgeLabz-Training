package medinventory;

import java.util.Objects;


class Item {

 String id;
 String name;
 int quantity;
 String expiryDate;

 public Item(String id, String name, int quantity, String expiryDate) {
     this.id = id;
     this.name = name;
     this.quantity = quantity;
     this.expiryDate = expiryDate;
 }


 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof Item)) return false;
     Item item = (Item) o;
     return id.equals(item.id);
 }

 @Override
 public int hashCode() {
     return Objects.hash(id);
 }
}
