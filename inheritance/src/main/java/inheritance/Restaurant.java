package inheritance;

// Thanks to James Dansie for providing help with the logic and some code

// Restaurant gets a linked list of reviews.
// The methods exist to update the constructor function, given a review added.

/*
NOTES
It's generally better to use built in Java's LinkedList -- See FrontRow video for Tues, Sept 24, 2019 --
versus my own, since it simplifies the code and can use for loops.
*/

public class Restaurant {
    // Instance variables
    String name;
    double stars0To5;
    int priceCategory;
    Node head;

    // constructor for Restaurant
    public Restaurant (String name, double stars0To5, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.stars0To5 = stars0To5;
    }



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

        // see 3pm on FrontRow for this section - to let reviews access restaurant.
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

    /* add in method that is called addReview:
    Add an instance method addReview to your Restaurant class.
    This method should take in a Review instance, and associate that review with this Restaurant

    Ideally, want to have all reviews associated with a restaurant.
    ret.reviews.get(0).restaurant
    One restaurant has many reviews, and one review has one restaurant
     */



    @Override
    public String toString() {
        return String.format(
                "The restaurant %s has a price category of %s and has an average of %s stars",
                this.name, this.priceCategory, this.stars0To5);
    }
}


