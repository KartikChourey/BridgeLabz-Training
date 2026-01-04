package com.linkedlist.singlylinkedlist.socialmedia;

public class UserNode {
    int userId;
    String name;
    FriendNode friends;
    UserNode next;

    UserNode(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }
}
