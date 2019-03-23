package ru.tracker;

import java.util.Date;
import java.util.Objects;

public class Item {
    private String name;
    private String desc;
    private Date time;
    private String id;

    public Item(String name, String desc, Date time) {
        this.name = name;
        this.desc = desc;
        this.time = time;
    }
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return this.desc;
        }
        public void setDesc(String desc) {
            this.desc = desc;
        }

            public Date getTime() {
            return this.time;
        }
        public void setTime(Date time) {
            this.time = time;
        }

        public String getId() {
            return this.id;
        }
        public void setId(String id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            return time == item.time && Objects.equals(id, item.id) && Objects.equals(name, item.name) && Objects.equals(desc, item.desc);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, desc, time);
        }

        @Override
        public String toString() {
            String out = "Request :\nname : " + this.name + "\nDescription : " + this.desc + "\nId : " + this.id
                    + "\nTime of request creation : " + this.time + "\n";
            return out;
    }

}