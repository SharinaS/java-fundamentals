package inheritance;

// Thanks to James Dansie for providing help with the logic and some code

// Restaurant gets a linked list of reviews.
// The methods exist to update the constructor function, given a review added.

public class Restaurant {
    String name;
    double stars0To5;
    int priceCategory;

    // constructor for Restaurant
    public Restaurant (String name, double stars0To5, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.stars0To5 = stars0To5;
    }

    // creates a linked list
    Node head;

    // Each node contains review body, review author and review star rating, each of which has to be
    // added to its respective node. First, create the class Node, establish a method to add a node to the list, then create
    // methods to add the data (body, author, star) to its respective node.

    class Node {
        Review data;
        Node next;

        public Node (Review data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    // method to add a new node to the beginning of the linked list
    public void insertNodeToHeadOfList(Review data) {
        this.head = new Node(data, this.head);
    }

    // add review info to the head of the list, given a review has a name, body and stars
    public void addReviewToHead(String name, String body, int stars){
        // use the insertNodeToHead method to insert content to node from each instance of a review
        insertNodeToHeadOfList(new Review(name, body, stars));
    }

    // count number of stars in the linked list for each restaurant,
    // and get the average stars for each restaurant's linked list,
    // then update the constructor function with the star average
    public void addUpStarsAndGetRestaurantAverage(){
        int starSum = 0;
        int restaurantCount = 0;

        // check if there's anything in the linked list
        if(head == null) {
            System.out.println("Please check back when there are reviews for this restaurant");
        } else {
            // start at the head of the restaurant list
            Node curr = this.head;
            // step through the list and count the stars
            while(curr != null) {
                starSum += curr.data.stars;
                restaurantCount += 1;
                curr = curr.next;
            }
        }
        // update the stars in the restaurant constructor function
        this.stars0To5 = starSum / restaurantCount;
    }



    @Override
    public String toString() {
        return String.format(
                "The restaurant %s has a price category of %s and has an average of %s stars",
                this.name, this.priceCategory, this.stars0To5);
    }

    //Test that your Restaurant constructor is behaving reasonably.
    //Implement a reasonable toString method for Restaurants.
    //Write a test to create an instance of Restaurant and ensure that its toString is working properly.
}


