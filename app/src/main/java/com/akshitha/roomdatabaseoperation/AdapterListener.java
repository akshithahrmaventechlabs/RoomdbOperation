package com.akshitha.roomdatabaseoperation;

import Room.Users;

public interface AdapterListener {
    void onUpdate(Users users);
    void ondelete(int id, int pos);
}
