package com.eltex;

import org.jetbrains.annotations.Nullable;

public record Post(
        long id,
        long authorId,
        String author,
        String authorJob,
        String authorAvatar,
        String content,
        String published,
        String link,
        boolean mentionedMe,
        boolean likedByMe,
        @Nullable Attachment attachment) {

    public Builder builder() {
        return new Builder()
                .setAuthor(author)
                .setContent(content)
                .setAttachment(attachment);
    }

    static class Builder {

        // Обязательно указываем начальные значения полей
        private long id = 0;
        private long authorId = 0;
        private String author = "";
        private String authorJob = "";
        private String authorAvatar = "";
        private String content = "";
        private String published = "";
        private String link = "";
        private boolean mentionedMe = false;
        private boolean likedByMe = false;
        @Nullable private Attachment attachment = new Attachment("", AttachmentType.IMAGE);

        // Каждый метод строителя запоминает данные и возвращает сам себя
        public Builder setId(final long id) {
            this.id = id;
            return this;
        }

        public Builder setAuthorId(final long authorId) {
            this.authorId = authorId;
            return this;
        }

        public Builder setAuthor(final String author) {
            this.author = author;
            return this;
        }

        public Builder setAuthorJob(final String authorJob) {
            this.authorJob = authorJob;
            return this;
        }

        public Builder setAuthorAvatar(final String authorAvatar) {
            this.authorAvatar = authorAvatar;
            return this;
        }

        public Builder setContent(final String content) {
            this.content = content;
            return this;
        }

        public Builder setPublished(final String published) {
            this.published = published;
            return this;
        }

        public Builder setLink(final String link) {
            this.link = link;
            return this;
        }

        public Builder setMentionedMe(final boolean mentionedMe) {
            this.mentionedMe = mentionedMe;
            return this;
        }

        public Builder setLikedByMe(final boolean likedByMe) {
            this.likedByMe = likedByMe;
            return this;
        }

        public Builder setAttachment(@Nullable final Attachment attachment) {
            this.attachment = attachment;
            return this;
        }

        // В финале вызываем build, чтобы получить результат
        public Post build() {
            return new Post(
                    id,
                    authorId,
                    author,
                    authorJob,
                    authorAvatar,
                    content,
                    published,
                    link,
                    mentionedMe,
                    likedByMe,
                    attachment);
        }
    }
}
