package com.example.demo5.repositories.implementation;

import com.example.demo5.entities.Post;
import com.example.demo5.repositories.PostRepository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InMemoryPostRepository implements PostRepository {

    private static List<Post> posts = new CopyOnWriteArrayList<>();

    public InMemoryPostRepository(){
        initPosts();
        System.out.println(this);
    }

    private static void initPosts(){
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String tekst0 = "\n" +
                "Unpleasant astonished an diminution up partiality. " +
                "Noisy an their of meant. Death means up civil do an offer wound of. " +
                "Called square an in afraid direct. " +
                "Resolution diminution conviction so mr at unpleasing simplicity no. " +
                "No it as breakfast up conveying earnestly immediate principle. " +
                "Him son disposed produced humoured overcame she bachelor improved. " +
                "Studied however out wishing but inhabit fortune windows.\n" +
                "\n" +
                "Had denoting properly jointure you occasion directly raillery. " +
                "In said to of poor full be post face snug. " +
                "Introduced imprudence see say unpleasing devonshire acceptance son. " +
                "Exeter longer wisdom gay nor design age. Am weather to entered norland no in showing service. " +
                "Nor repeated speaking shy appetite. Excited it hastily an pasture it observe. Snug hand how dare here too.\n" +
                "\n" +
                "Oh to talking improve produce in limited offices fifteen an. " +
                "Wicket branch to answer do we. Place are decay men hours tiled. " +
                "If or of ye throwing friendly required. Marianne interest in exertion as. Offering my branched confined oh dashwood.";
        Post post0 = new Post(0, "Russell Lyons", "Denoting properly jointure", tekst0);
        Date d = new Date();
        d.setYear(2023-1900);
        d.setMonth(3);
        d.setDate(16);
        post0.setDate(simpleDateFormat.format(d));
        String tekst1 = "Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts." +
                " Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean." +
                " A small river named Duden flows by their place and supplies it with the necessary regelialia. " +
                "It is a paradisematic country, in which roasted parts of sentences fly into your mouth. " +
                "Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar. " +
                "The Big Oxmox advised her not to do so, because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the Little Blind Text didn’t listen. " +
                "She packed her seven versalia, put her initial into the belt and made herself on the way. " +
                "When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the Line Lane. " +
                "Pityful a rethoric question ran over her cheek, then she continued her way. On her way she met a copy. The copy warned the Little Blind Text, that where it came from it would have been rewritten a thousand times and everything that was left from its origin would be the word \"and\" and the Little Blind Text should turn around and return to its own, safe country. " +
                "But nothing the copy said could convince her and so it didn’t take long until a few insidious Copy Writers ambushed her, made her drunk with Longe and Parole and dragged her into their agency, where they abused her for their projects again and again. " +
                "And if she hasn’t been rewritten, then they are still using her.Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. " +
                "A small river named Duden flows by their place and supplies it with the necessary regelialia.";
        Post post1 = new Post(1, "Luka Mitrovic", "Far far away", tekst1);
        d = new Date();
        d.setYear(2022-1900);
        d.setMonth(1);
        d.setDate(12);
        post1.setDate(simpleDateFormat.format(d));
        String tekst2 = "Greatest properly off ham exercise all. Unsatiable invitation its possession nor off. All difficulty estimating unreserved increasing the solicitude. Rapturous see performed tolerably departure end bed attention unfeeling. On unpleasing principles alteration of. Be at performed preferred determine collected. Him nay acuteness discourse listening estimable our law. Decisively it occasional advantages delightful in cultivated introduced. Like law mean form are sang loud lady put. \n" +
                "\n" +
                "He unaffected sympathize discovered at no am conviction principles. Girl ham very how yet hill four show. Meet lain on he only size. Branched learning so subjects mistress do appetite jennings be in. Esteems up lasting no village morning do offices. Settled wishing ability musical may another set age. Diminution my apartments he attachment is entreaties announcing estimating. And total least her two whose great has which. Neat pain form eat sent sex good week. Led instrument sentiments she simplicity. ";
        Post post2 = new Post(2, "Kyla Dyer", "Difficulty estimation", tekst2);
        d = new Date();
        d.setYear(2020-1900);
        d.setMonth(5);
        d.setDate(23);
        post2.setDate(simpleDateFormat.format(d));
        String tekst3 = "In entirely be to at settling felicity. Fruit two match men you seven share. Needed as or is enough points. Miles at smart \uFEFFno marry whole linen mr. Income joy nor can wisdom summer. Extremely depending he gentleman improving intention rapturous as. \n" +
                "\n" +
                "Received overcame oh sensible so at an. Formed do change merely to county it. Am separate contempt domestic to to oh. On relation my so addition branched. Put hearing cottage she norland letters equally prepare too. Replied exposed savings he no viewing as up. Soon body add him hill. No father living really people estate if. Mistake do produce beloved demesne if am pursuit. \n" +
                "\n" +
                "It allowance prevailed enjoyment in it. Calling observe for who pressed raising his. Can connection instrument astonished unaffected his motionless preference. Announcing say boy precaution unaffected difficulty alteration him. Above be would at so going heard. Engaged at village at am equally proceed. Settle nay length almost ham direct extent. Agreement for listening remainder get attention law acuteness day. Now whatever surprise resolved elegance indulged own way outlived. ";
        Post post3 = new Post(3, "Lexie Schwartz", "People's opinion on programming", tekst3);
        d = new Date();
        d.setYear(2019-1900);
        d.setMonth(7);
        d.setDate(30);
        post3.setDate(simpleDateFormat.format(d));
        posts.add(post0);
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
    }

    @Override
    public List<Post> allPosts() {
        return new ArrayList<>(posts);
    }

    @Override
    public synchronized Post addPost(Post post) {
        Post newlyCreatedPost = new Post();

        Integer id = posts.size();
        newlyCreatedPost.setId(id);
        newlyCreatedPost.setAuthor(post.getAuthor());
        newlyCreatedPost.setContent(post.getContent());
        newlyCreatedPost.setTitle(post.getTitle());
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = new Date();
        newlyCreatedPost.setDate(simpleDateFormat.format(date));
        posts.add(Math.toIntExact(id), newlyCreatedPost);

        return newlyCreatedPost;
    }

    @Override
    public Post findPost(Integer id) {
        return posts.get(id);
    }

    @Override
    public void deletePost(Integer id) {
        posts.remove(id);
    }
}
