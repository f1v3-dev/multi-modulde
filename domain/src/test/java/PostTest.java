import com.f1v3.demo.post.Post;
import com.f1v3.demo.post.PostCreate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PostTest {


    @Test
    void PostCreate로_Post가_생성된다() {

        // given
        PostCreate postCreate = new PostCreate("title", "content");

        // when
        Post post = Post.from(postCreate);

        // then
        assertEquals(post.getTitle(), "title");
        assertEquals(post.getContent(), "content");

    }
}
