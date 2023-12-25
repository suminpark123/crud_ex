package com.sumin.crud_ex.service;

import com.sumin.crud_ex.model.Post;
import com.sumin.crud_ex.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<Post> getAllPosts();

    PostDto getPostById(long id);

    PostDto updatePostById(long id, PostDto postDto);
    String delatePostById(long id);


}
