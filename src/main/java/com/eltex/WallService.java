package com.eltex;

public class WallService {
    private Post post = new Post.Builder().build();

    public void setContent(final String content) {
        post = post.builder()
                .setContent(content)
                .build();
    }

    public void setAuthor(final String author) {
        post = post.builder()
                .setAuthor(author)
                .build();
    }

    public Post getPost() {
        return post;
    }
}
