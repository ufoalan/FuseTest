package org.mycompany;

import java.util.List;

public class MyData {

    private Tool tool;
    private List<Book> book;

    // getters and setters omitted for brevity
    public Tool getTool() {
        return this.tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public List<Book> getBook() {
        return this.book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public static class Tool {

        private JsonPath jsonpath;

        // getters and setters omitted for brevity
        public JsonPath getJsonPath() {
            return this.jsonpath;
        }

        public void setJsonPath(JsonPath jsonpath) {
            this.jsonpath = jsonpath;
        }

        public static class JsonPath {

            private Creator creator;

            // getters and setters omitted for brevity
            public Creator getCreator() {
                return this.creator;
            }

            public void setCreator(Creator creator) {
                this.creator = creator;
            }

            public static class Creator {

                private String name;
                private List<String> location;

                // getters and setters omitted for brevity
                public String getName() {
                    return this.name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List getLocation() {
                    return this.location;
                }

                public void setLocation(List<String> location) {
                    this.location = location;
                }

            }

        }

    }

    public static class Book {

        private String title;
        private double price;

        // getters and setters omitted for brevity
        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Double getPrice() {
            return this.price;
        }
        
        public void setPrice(Double price) {
            this.price = price;
        }
    }

}
