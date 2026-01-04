package com.linkedlist.singlylinkedlist.socialmedia;

public class SocialMain {
    public static void main(String[] args) {
        UserNode u1 = new UserNode(1, "Kartik");
        u1.friends = new FriendNode(2);
        System.out.println("Friend added for " + u1.name);
    }
}
