package zzs.example.demo.navigationtemp.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieDetailBean {

    /**
     * rating : {"max":10,"average":7.9,"details":{"1":30,"3":4378,"2":245,"5":4382,"4":11291},"stars":"40","min":0}
     * reviews_count : 388
     * videos : []
     * wish_count : 87225
     * original_title : The Mule
     * blooper_urls : ["http://vt1.doubanio.com/201911131612/4840a55bba51ba5e6cd39b37b4930f66/view/movie/M/302510662.mp4","http://vt1.doubanio.com/201911131612/dd4f2553087eb02c6d9a76e3bfb16ee2/view/movie/M/302510371.mp4","http://vt1.doubanio.com/201911131612/9f4c38c08790e89c4d541ca4e3335df4/view/movie/M/302400864.mp4","http://vt1.doubanio.com/201911131612/b4f9d251b055b5deefdfbf228059a7e8/view/movie/M/302400774.mp4"]
     * collect_count : 84760
     * images : {"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2563626309.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2563626309.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2563626309.webp"}
     * douban_site :
     * year : 2018
     * popular_comments : [{"rating":{"max":5,"value":5,"min":0},"useful_count":976,"author":{"uid":"176122983","avatar":"https://img1.doubanio.com/icon/u176122983-29.jpg","signature":"","alt":"https://www.douban.com/people/176122983/","id":"176122983","name":"V."},"subject_id":"30135113","content":"如果开年的【15:17到巴黎】是一次失手的话，那么这部电影足以证明Eastwood宝刀未老。\n而且老爷子已经88岁了，怎么还有人要自作聪明的去教他如何拍电影?\n不排除这会是老爷子的谢幕之作了，各位且看且珍惜。","created_at":"2018-12-14 22:06:07","id":"1518702184"},{"rating":{"max":5,"value":4,"min":0},"useful_count":271,"author":{"uid":"1237270","avatar":"https://img3.doubanio.com/icon/u1237270-133.jpg","signature":"半停用。","alt":"https://www.douban.com/people/1237270/","id":"1237270","name":"私~川流"},"subject_id":"30135113","content":"You are the love of my life and the pain of my life. I want you to know, it means a lot to me. ","created_at":"2019-01-19 19:45:08","id":"1634292764"},{"rating":{"max":5,"value":3,"min":0},"useful_count":76,"author":{"uid":"flxjp","avatar":"https://img1.doubanio.com/icon/u2316731-67.jpg","signature":"一愉悦就伴随着痛苦。","alt":"https://www.douban.com/people/flxjp/","id":"2316731","name":"法兰西胶片"},"subject_id":"30135113","content":"东木老爷子的电影已经成为全人类最后的舒适区。","created_at":"2019-04-11 00:14:50","id":"1748576787"},{"rating":{"max":5,"value":4,"min":0},"useful_count":124,"author":{"uid":"terenceyibo","avatar":"https://img3.doubanio.com/icon/u80915199-11.jpg","signature":"I'm Dougie's Coffee.","alt":"https://www.douban.com/people/terenceyibo/","id":"80915199","name":"TWY"},"subject_id":"30135113","content":"最后的老牛仔精神，东木让你平静地紧张起来，对新世纪强烈的无力感也太棒了，佳作就这么简单。","created_at":"2018-12-27 10:07:36","id":"1593759471"}]
     * alt : https://movie.douban.com/subject/30135113/
     * id : 30135113
     * mobile_url : https://movie.douban.com/subject/30135113/mobile
     * photos_count : 322
     * pubdate : 2019-08-26
     * title : 骡子
     * do_count : null
     * has_video : false
     * share_url : https://m.douban.com/movie/subject/30135113
     * seasons_count : null
     * languages : ["英语"]
     * schedule_url :
     * writers : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1538557762.5.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1538557762.5.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1538557762.5.webp"},"name_en":"Nick Schenk","name":"尼克·申克","alt":"https://movie.douban.com/celebrity/1333973/","id":"1333973"}]
     * pubdates : ["2018-12-14(美国)","2019-08-26(中国大陆)"]
     * website :
     * tags : ["美国","犯罪","剧情","真实改编","人性","贩毒","老年","家庭","悬疑","2018"]
     * has_schedule : false
     * durations : ["116分钟","112分钟(中国大陆)"]
     * genres : ["剧情","犯罪"]
     * collection : null
     * trailers : [{"medium":"https://img1.doubanio.com/img/trailer/medium/2566904868.jpg?","title":"中国预告片：自我救赎版 (中文字幕)","subject_id":"30135113","alt":"https://movie.douban.com/trailer/251847/","small":"https://img1.doubanio.com/img/trailer/small/2566904868.jpg?","resource_url":"http://vt1.doubanio.com/201911131612/302b9c6ff82f3f151f10922409d21938/view/movie/M/302510847.mp4","id":"251847"},{"medium":"https://img3.doubanio.com/img/trailer/medium/2566192121.jpg?","title":"中国预告片：导演问候版 (中文字幕)","subject_id":"30135113","alt":"https://movie.douban.com/trailer/251514/","small":"https://img3.doubanio.com/img/trailer/small/2566192121.jpg?","resource_url":"http://vt1.doubanio.com/201911131612/3ee9f2a6984a88421cd7ff72bdc1f2c1/view/movie/M/302510514.mp4","id":"251514"},{"medium":"https://img3.doubanio.com/img/trailer/medium/2565876053.jpg?","title":"中国预告片：九死一生版 (中文字幕)","subject_id":"30135113","alt":"https://movie.douban.com/trailer/251444/","small":"https://img3.doubanio.com/img/trailer/small/2565876053.jpg?","resource_url":"http://vt1.doubanio.com/201911131612/ca71b0815214a507b0e37daefa2d4b85/view/movie/M/302510444.mp4","id":"251444"},{"medium":"https://img3.doubanio.com/img/trailer/medium/2565738922.jpg?","title":"中国预告片：终极版 (中文字幕)","subject_id":"30135113","alt":"https://movie.douban.com/trailer/251367/","small":"https://img3.doubanio.com/img/trailer/small/2565738922.jpg?","resource_url":"http://vt1.doubanio.com/201911131612/571d13d87a490a374f29ab207fde7689/view/movie/M/302510367.mp4","id":"251367"}]
     * episodes_count : null
     * trailer_urls : ["http://vt1.doubanio.com/201911131612/302b9c6ff82f3f151f10922409d21938/view/movie/M/302510847.mp4","http://vt1.doubanio.com/201911131612/3ee9f2a6984a88421cd7ff72bdc1f2c1/view/movie/M/302510514.mp4","http://vt1.doubanio.com/201911131612/ca71b0815214a507b0e37daefa2d4b85/view/movie/M/302510444.mp4","http://vt1.doubanio.com/201911131612/571d13d87a490a374f29ab207fde7689/view/movie/M/302510367.mp4"]
     * has_ticket : false
     * bloopers : [{"medium":"https://img3.doubanio.com/img/trailer/medium/2566393215.jpg?","title":"花絮：导演特辑","subject_id":"30135113","alt":"https://movie.douban.com/trailer/251662/","small":"https://img3.doubanio.com/img/trailer/small/2566393215.jpg?","resource_url":"http://vt1.doubanio.com/201911131612/4840a55bba51ba5e6cd39b37b4930f66/view/movie/M/302510662.mp4","id":"251662"},{"medium":"https://img3.doubanio.com/img/trailer/medium/2565742481.jpg?","title":"花絮：传奇继续特辑 (中文字幕)","subject_id":"30135113","alt":"https://movie.douban.com/trailer/251371/","small":"https://img3.doubanio.com/img/trailer/small/2565742481.jpg?","resource_url":"http://vt1.doubanio.com/201911131612/dd4f2553087eb02c6d9a76e3bfb16ee2/view/movie/M/302510371.mp4","id":"251371"},{"medium":"https://img3.doubanio.com/img/trailer/medium/2542902163.jpg?","title":"花絮","subject_id":"30135113","alt":"https://movie.douban.com/trailer/240864/","small":"https://img3.doubanio.com/img/trailer/small/2542902163.jpg?","resource_url":"http://vt1.doubanio.com/201911131612/9f4c38c08790e89c4d541ca4e3335df4/view/movie/M/302400864.mp4","id":"240864"},{"medium":"https://img3.doubanio.com/img/trailer/medium/2542631654.jpg?","title":"花絮","subject_id":"30135113","alt":"https://movie.douban.com/trailer/240774/","small":"https://img3.doubanio.com/img/trailer/small/2542631654.jpg?","resource_url":"http://vt1.doubanio.com/201911131612/b4f9d251b055b5deefdfbf228059a7e8/view/movie/M/302400774.mp4","id":"240774"}]
     * clip_urls : ["http://vt1.doubanio.com/201911131612/ca89e42f8be32f21620a5785f7617bf0/view/movie/M/302510879.mp4"]
     * current_season : null
     * casts : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp"},"name_en":"Clint Eastwood","name":"克林特·伊斯特伍德","alt":"https://movie.douban.com/celebrity/1054436/","id":"1054436"},{"avatars":{"small":"https://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12956.webp","large":"https://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12956.webp","medium":"https://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12956.webp"},"name_en":"Bradley Cooper","name":"布莱德利·库珀","alt":"https://movie.douban.com/celebrity/1013757/","id":"1013757"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490098154.3.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490098154.3.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490098154.3.webp"},"name_en":"Laurence Fishburne","name":"劳伦斯·菲什伯恩","alt":"https://movie.douban.com/celebrity/1022596/","id":"1022596"},{"avatars":{"small":"https://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1454118774.76.webp","large":"https://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1454118774.76.webp","medium":"https://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1454118774.76.webp"},"name_en":"Michael Peña","name":"迈克尔·佩纳","alt":"https://movie.douban.com/celebrity/1131634/","id":"1131634"}]
     * countries : ["美国"]
     * mainland_pubdate : 2019-08-26
     * photos : [{"thumb":"https://img1.doubanio.com/view/photo/m/public/p2553836098.webp","image":"https://img1.doubanio.com/view/photo/l/public/p2553836098.webp","cover":"https://img1.doubanio.com/view/photo/sqs/public/p2553836098.webp","alt":"https://movie.douban.com/photos/photo/2553836098/","id":"2553836098","icon":"https://img1.doubanio.com/view/photo/s/public/p2553836098.webp"},{"thumb":"https://img3.doubanio.com/view/photo/m/public/p2551531282.webp","image":"https://img3.doubanio.com/view/photo/l/public/p2551531282.webp","cover":"https://img3.doubanio.com/view/photo/sqs/public/p2551531282.webp","alt":"https://movie.douban.com/photos/photo/2551531282/","id":"2551531282","icon":"https://img3.doubanio.com/view/photo/s/public/p2551531282.webp"},{"thumb":"https://img3.doubanio.com/view/photo/m/public/p2566903021.webp","image":"https://img3.doubanio.com/view/photo/l/public/p2566903021.webp","cover":"https://img3.doubanio.com/view/photo/sqs/public/p2566903021.webp","alt":"https://movie.douban.com/photos/photo/2566903021/","id":"2566903021","icon":"https://img3.doubanio.com/view/photo/s/public/p2566903021.webp"},{"thumb":"https://img1.doubanio.com/view/photo/m/public/p2566378027.webp","image":"https://img1.doubanio.com/view/photo/l/public/p2566378027.webp","cover":"https://img1.doubanio.com/view/photo/sqs/public/p2566378027.webp","alt":"https://movie.douban.com/photos/photo/2566378027/","id":"2566378027","icon":"https://img1.doubanio.com/view/photo/s/public/p2566378027.webp"},{"thumb":"https://img3.doubanio.com/view/photo/m/public/p2564910922.webp","image":"https://img3.doubanio.com/view/photo/l/public/p2564910922.webp","cover":"https://img3.doubanio.com/view/photo/sqs/public/p2564910922.webp","alt":"https://movie.douban.com/photos/photo/2564910922/","id":"2564910922","icon":"https://img3.doubanio.com/view/photo/s/public/p2564910922.webp"},{"thumb":"https://img3.doubanio.com/view/photo/m/public/p2559440995.webp","image":"https://img3.doubanio.com/view/photo/l/public/p2559440995.webp","cover":"https://img3.doubanio.com/view/photo/sqs/public/p2559440995.webp","alt":"https://movie.douban.com/photos/photo/2559440995/","id":"2559440995","icon":"https://img3.doubanio.com/view/photo/s/public/p2559440995.webp"},{"thumb":"https://img3.doubanio.com/view/photo/m/public/p2551850322.webp","image":"https://img3.doubanio.com/view/photo/l/public/p2551850322.webp","cover":"https://img3.doubanio.com/view/photo/sqs/public/p2551850322.webp","alt":"https://movie.douban.com/photos/photo/2551850322/","id":"2551850322","icon":"https://img3.doubanio.com/view/photo/s/public/p2551850322.webp"},{"thumb":"https://img3.doubanio.com/view/photo/m/public/p2551628980.webp","image":"https://img3.doubanio.com/view/photo/l/public/p2551628980.webp","cover":"https://img3.doubanio.com/view/photo/sqs/public/p2551628980.webp","alt":"https://movie.douban.com/photos/photo/2551628980/","id":"2551628980","icon":"https://img3.doubanio.com/view/photo/s/public/p2551628980.webp"},{"thumb":"https://img3.doubanio.com/view/photo/m/public/p2551425991.webp","image":"https://img3.doubanio.com/view/photo/l/public/p2551425991.webp","cover":"https://img3.doubanio.com/view/photo/sqs/public/p2551425991.webp","alt":"https://movie.douban.com/photos/photo/2551425991/","id":"2551425991","icon":"https://img3.doubanio.com/view/photo/s/public/p2551425991.webp"},{"thumb":"https://img1.doubanio.com/view/photo/m/public/p2573783738.webp","image":"https://img1.doubanio.com/view/photo/l/public/p2573783738.webp","cover":"https://img1.doubanio.com/view/photo/sqs/public/p2573783738.webp","alt":"https://movie.douban.com/photos/photo/2573783738/","id":"2573783738","icon":"https://img1.doubanio.com/view/photo/s/public/p2573783738.webp"}]
     * summary : 克林特·伊斯特伍德饰演厄尔·斯通，一个破产且独居的八旬老人。当房产因资不抵债被扣押拍卖时，厄尔得到一份只需要他开车的工作——这份工作足够简单，但厄尔不知道的是，他成为了墨西哥贩毒集团的一名运毒者。他完成的非常出色，事实上经由他运输的毒品越来越多，以至于后来贩毒集团专门给他配备了一名对接人。但是，暗中盯上厄尔的并不只有贩毒集团，这位神秘的新晋运毒者也吸引了美国缉毒局特工科林·贝茨的注意。虽然厄尔的财务问题就此得到解决，但他曾经犯下的种种人生错误也逐渐开始带来沉重的压力。在被执法部门逮捕归案，或者被贩毒集团下毒手之前，厄尔还有足够的时间来纠正错误吗？
     * clips : [{"medium":"https://img1.doubanio.com/img/trailer/medium/2566997958.jpg?","title":"片段 (中文字幕)","subject_id":"30135113","alt":"https://movie.douban.com/trailer/251879/","small":"https://img1.doubanio.com/img/trailer/small/2566997958.jpg?","resource_url":"http://vt1.doubanio.com/201911131612/ca89e42f8be32f21620a5785f7617bf0/view/movie/M/302510879.mp4","id":"251879"}]
     * subtype : movie
     * directors : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp"},"name_en":"Clint Eastwood","name":"克林特·伊斯特伍德","alt":"https://movie.douban.com/celebrity/1054436/","id":"1054436"}]
     * comments_count : 20993
     * popular_reviews : [{"rating":{"max":5,"value":4,"min":0},"title":"88岁的伊斯特伍德说，即便当毒贩，他也要干的比年轻人更好","subject_id":"30135113","author":{"uid":"colinpark","avatar":"https://img3.doubanio.com/icon/u49097402-173.jpg","signature":"The Great Clown Pagliacci","alt":"https://www.douban.com/people/colinpark/","id":"49097402","name":"西帕克"},"summary":"文_西帕克 2011年10月，在密歇根州警和DEA（美国缉毒署）的一次联合行动中，逮捕了一个不寻常的毒贩。87岁的里奥·厄尔·夏普（Leo Earl Sharp Sr.），因持有200磅可卡因而被逮捕。夏普是专门为黑帮运送毒品的\u201c...","alt":"https://movie.douban.com/review/10079690/","id":"10079690"},{"rating":{"max":5,"value":4,"min":0},"title":"家庭，请给自由主义者让路","subject_id":"30135113","author":{"uid":"justbeyond","avatar":"https://img3.doubanio.com/icon/u121673253-14.jpg","signature":"","alt":"https://www.douban.com/people/justbeyond/","id":"121673253","name":"洗心革面梅什金"},"summary":"很多人说这部电影在讲人的救赎，讲人应该重视家庭，我一点没看出来，相反，我觉得这部电影给人的感觉很冷血，十分冷血。Eastwood用一个看似温和的表象包裹了一把说出来会刺痛所有人的刀子，那便是这部电影的主旨...","alt":"https://movie.douban.com/review/10071752/","id":"10071752"},{"rating":{"max":5,"value":4,"min":0},"title":"骡子又没生育能力，咱就别再阉割了吧","subject_id":"30135113","author":{"uid":"xiaoyuhen","avatar":"https://img3.doubanio.com/icon/u52839991-5.jpg","signature":"","alt":"https://www.douban.com/people/xiaoyuhen/","id":"52839991","name":"xiao雨痕"},"summary":"本来第二次在大银幕上看东木老爷子的作品，非常感动。 结果今天得知国内上映版本删减4分钟，顿时有吃苍蝇的感觉。 删减的片段集中在两个地方： 厄尔在旅馆召妓片段 厄尔在墨西哥毒贩 party 3P 片段 主要删减原因...","alt":"https://movie.douban.com/review/10442368/","id":"10442368"},{"rating":{"max":5,"value":3,"min":0},"title":"鸡汤和鸡血之下的种族议题","subject_id":"30135113","author":{"uid":"1233038","avatar":"https://img3.doubanio.com/icon/u1233038-2.jpg","signature":"《杨天乐买房记》上市","alt":"https://www.douban.com/people/1233038/","id":"1233038","name":"frozenmoon"},"summary":"（文/杨时旸） 伊斯特伍德带来了这部《骡子》，在影迷圈内备受赞誉，但据说在美国影评界却颇受苛责，苛责的内容是关于这个老导演对于种族的态度。是的，这个故事看起来像个奇情的社会新闻，原本的真实事件更像一...","alt":"https://movie.douban.com/review/10118623/","id":"10118623"},{"rating":{"max":5,"value":5,"min":0},"title":"这可能是克林特·伊斯特伍德最适合的谢幕之作。","subject_id":"30135113","author":{"uid":"myunusual","avatar":"https://img9.doubanio.com/icon/u34883318-26.jpg","signature":"","alt":"https://www.douban.com/people/myunusual/","id":"34883318","name":"sakay"},"summary":"2018年末，我最喜欢的导演克林特·伊斯特伍德，带着可能是他最后一部电影《骡子》再次出现在影迷面前，1930年生，如今88岁的高龄活跃在影坛上，上一部电影他曾在获得奥斯卡提名的《美国狙击手》里客串，如今在《...","alt":"https://movie.douban.com/review/10060687/","id":"10060687"},{"rating":{"max":5,"value":4,"min":0},"title":"老炮儿","subject_id":"30135113","author":{"uid":"MovieL","avatar":"https://img1.doubanio.com/icon/u1128221-98.jpg","signature":"公众号：moviesss","alt":"https://www.douban.com/people/MovieL/","id":"1128221","name":"木卫二"},"summary":"伊斯特伍德饰演一个退伍的老兵，白人，活在过去荣光，喜欢和老伙计们不时聚会的那种男性。传说中的老白男，也是铁杆的川普选民，开场就被人称呼为\u201c老混蛋\u201d。 他不会手机、抗拒网购、排斥新事物也不习惯黑人的正...","alt":"https://movie.douban.com/review/10443371/","id":"10443371"},{"rating":{"max":5,"value":4,"min":0},"title":"【春天的放牛班】观影团周限定观影\u2014\u2014《骡子》","subject_id":"30135113","author":{"uid":"191222410","avatar":"https://img3.doubanio.com/icon/u191222410-3.jpg","signature":"","alt":"https://www.douban.com/people/191222410/","id":"191222410","name":"一级特工"},"summary":"Leo Sharp是一位二战老兵，得过铜星勋章，也是有名的园艺家和花匠。80多岁开始运毒，共计一千多镑。于2011年被捕时87岁，被认为是最老的毒骡。 年近九旬的东木老爷子在《美国狙击手》《萨利机长》后继续将视线对...","alt":"https://movie.douban.com/review/10455877/","id":"10455877"},{"rating":{"max":5,"value":3,"min":0},"title":"金羊观影团||老骥伏枥，志在千里","subject_id":"30135113","author":{"uid":"dekadeyang","avatar":"https://img1.doubanio.com/icon/u146177041-49.jpg","signature":"Tuer le film.","alt":"https://www.douban.com/people/dekadeyang/","id":"146177041","name":"德卡的羊"},"summary":"观影团就这样迎来了第三期，由于本周的院线新片确实是没什么亮点，于是我们决定将目光聚焦到一部网络上相当热门的新片，来自于克林特·伊斯特伍德的《骡子》。 在经历了《15点17分，启程巴黎》的失利之后，咱们的...","alt":"https://movie.douban.com/review/10080818/","id":"10080818"},{"rating":{"max":5,"value":4,"min":0},"title":"不要温和地走进那个良夜","subject_id":"30135113","author":{"uid":"51859658","avatar":"https://img1.doubanio.com/icon/u51859658-9.jpg","signature":"","alt":"https://www.douban.com/people/51859658/","id":"51859658","name":"Paul"},"summary":"传奇遇上传奇 看好莱坞电影，永远避不开克林特·伊斯特伍德，也几乎是避无可避。 克林特·伊斯特伍德，1930年出生，1955年参演人生第一部电影，从业至今已有64年，而他本人也已经89岁了，如此高龄依然奋斗于电影...","alt":"https://movie.douban.com/review/10425248/","id":"10425248"},{"rating":{"max":5,"value":4,"min":0},"title":"《骡子》（The Mule, 2018）：一点感想","subject_id":"30135113","author":{"uid":"161454319","avatar":"https://img3.doubanio.com/icon/u161454319-1.jpg","signature":"","alt":"https://www.douban.com/people/161454319/","id":"161454319","name":"木子妤"},"summary":"期末考前夕，还是来看了一部电影。 凑巧的是这个星期是继上个星期看《贼王》之后，又一部的老人犯罪主题电影。 以老人为故事灵魂主体的，我想这在现代叙事长河里会愈加频繁。现今人类平均年龄因为各种原因得到提...","alt":"https://movie.douban.com/review/9890940/","id":"9890940"}]
     * ratings_count : 72391
     * aka : ["毒行侠(港)","赌命运转手(台)","走私运毒者"]
     */

    private RatingBean rating;
    private int reviews_count;
    private int wish_count;
    private String original_title;
    private int collect_count;
    private ImagesBean images;
    private String douban_site;
    private String year;
    private String alt;
    private String id;
    private String mobile_url;
    private int photos_count;
    private String pubdate;
    private String title;
    private Object do_count;
    private boolean has_video;
    private String share_url;
    private Object seasons_count;
    private String schedule_url;
    private String website;
    private boolean has_schedule;
    private Object collection;
    private Object episodes_count;
    private boolean has_ticket;
    private Object current_season;
    private String mainland_pubdate;
    private String summary;
    private String subtype;
    private int comments_count;
    private int ratings_count;
    private List<?> videos;
    private List<String> blooper_urls;
    private List<PopularCommentsBean> popular_comments;
    private List<String> languages;
    private List<WritersBean> writers;
    private List<String> pubdates;
    private List<String> tags;
    private List<String> durations;
    private List<String> genres;
    private List<TrailersBean> trailers;
    private List<String> trailer_urls;
    private List<BloopersBean> bloopers;
    private List<String> clip_urls;
    private List<CastsBean> casts;
    private List<String> countries;
    private List<PhotosBean> photos;
    private List<ClipsBean> clips;
    private List<DirectorsBean> directors;
    private List<PopularReviewsBean> popular_reviews;
    private List<String> aka;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public int getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public int getWish_count() {
        return wish_count;
    }

    public void setWish_count(int wish_count) {
        this.wish_count = wish_count;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getDouban_site() {
        return douban_site;
    }

    public void setDouban_site(String douban_site) {
        this.douban_site = douban_site;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public int getPhotos_count() {
        return photos_count;
    }

    public void setPhotos_count(int photos_count) {
        this.photos_count = photos_count;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDo_count() {
        return do_count;
    }

    public void setDo_count(Object do_count) {
        this.do_count = do_count;
    }

    public boolean isHas_video() {
        return has_video;
    }

    public void setHas_video(boolean has_video) {
        this.has_video = has_video;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public Object getSeasons_count() {
        return seasons_count;
    }

    public void setSeasons_count(Object seasons_count) {
        this.seasons_count = seasons_count;
    }

    public String getSchedule_url() {
        return schedule_url;
    }

    public void setSchedule_url(String schedule_url) {
        this.schedule_url = schedule_url;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isHas_schedule() {
        return has_schedule;
    }

    public void setHas_schedule(boolean has_schedule) {
        this.has_schedule = has_schedule;
    }

    public Object getCollection() {
        return collection;
    }

    public void setCollection(Object collection) {
        this.collection = collection;
    }

    public Object getEpisodes_count() {
        return episodes_count;
    }

    public void setEpisodes_count(Object episodes_count) {
        this.episodes_count = episodes_count;
    }

    public boolean isHas_ticket() {
        return has_ticket;
    }

    public void setHas_ticket(boolean has_ticket) {
        this.has_ticket = has_ticket;
    }

    public Object getCurrent_season() {
        return current_season;
    }

    public void setCurrent_season(Object current_season) {
        this.current_season = current_season;
    }

    public String getMainland_pubdate() {
        return mainland_pubdate;
    }

    public void setMainland_pubdate(String mainland_pubdate) {
        this.mainland_pubdate = mainland_pubdate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public List<?> getVideos() {
        return videos;
    }

    public void setVideos(List<?> videos) {
        this.videos = videos;
    }

    public List<String> getBlooper_urls() {
        return blooper_urls;
    }

    public void setBlooper_urls(List<String> blooper_urls) {
        this.blooper_urls = blooper_urls;
    }

    public List<PopularCommentsBean> getPopular_comments() {
        return popular_comments;
    }

    public void setPopular_comments(List<PopularCommentsBean> popular_comments) {
        this.popular_comments = popular_comments;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<WritersBean> getWriters() {
        return writers;
    }

    public void setWriters(List<WritersBean> writers) {
        this.writers = writers;
    }

    public List<String> getPubdates() {
        return pubdates;
    }

    public void setPubdates(List<String> pubdates) {
        this.pubdates = pubdates;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getDurations() {
        return durations;
    }

    public void setDurations(List<String> durations) {
        this.durations = durations;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<TrailersBean> getTrailers() {
        return trailers;
    }

    public void setTrailers(List<TrailersBean> trailers) {
        this.trailers = trailers;
    }

    public List<String> getTrailer_urls() {
        return trailer_urls;
    }

    public void setTrailer_urls(List<String> trailer_urls) {
        this.trailer_urls = trailer_urls;
    }

    public List<BloopersBean> getBloopers() {
        return bloopers;
    }

    public void setBloopers(List<BloopersBean> bloopers) {
        this.bloopers = bloopers;
    }

    public List<String> getClip_urls() {
        return clip_urls;
    }

    public void setClip_urls(List<String> clip_urls) {
        this.clip_urls = clip_urls;
    }

    public List<CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsBean> casts) {
        this.casts = casts;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<PhotosBean> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotosBean> photos) {
        this.photos = photos;
    }

    public List<ClipsBean> getClips() {
        return clips;
    }

    public void setClips(List<ClipsBean> clips) {
        this.clips = clips;
    }

    public List<DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsBean> directors) {
        this.directors = directors;
    }

    public List<PopularReviewsBean> getPopular_reviews() {
        return popular_reviews;
    }

    public void setPopular_reviews(List<PopularReviewsBean> popular_reviews) {
        this.popular_reviews = popular_reviews;
    }

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
    }

    public static class RatingBean {
        /**
         * max : 10
         * average : 7.9
         * details : {"1":30,"3":4378,"2":245,"5":4382,"4":11291}
         * stars : 40
         * min : 0
         */

        private int max;
        private double average;
        private DetailsBean details;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public DetailsBean getDetails() {
            return details;
        }

        public void setDetails(DetailsBean details) {
            this.details = details;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public static class DetailsBean {
            /**
             * 1 : 30
             * 3 : 4378
             * 2 : 245
             * 5 : 4382
             * 4 : 11291
             */

            @SerializedName("1")
            private int _$1;
            @SerializedName("3")
            private int _$3;
            @SerializedName("2")
            private int _$2;
            @SerializedName("5")
            private int _$5;
            @SerializedName("4")
            private int _$4;

            public int get_$1() {
                return _$1;
            }

            public void set_$1(int _$1) {
                this._$1 = _$1;
            }

            public int get_$3() {
                return _$3;
            }

            public void set_$3(int _$3) {
                this._$3 = _$3;
            }

            public int get_$2() {
                return _$2;
            }

            public void set_$2(int _$2) {
                this._$2 = _$2;
            }

            public int get_$5() {
                return _$5;
            }

            public void set_$5(int _$5) {
                this._$5 = _$5;
            }

            public int get_$4() {
                return _$4;
            }

            public void set_$4(int _$4) {
                this._$4 = _$4;
            }
        }
    }

    public static class ImagesBean {
        /**
         * small : https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2563626309.webp
         * large : https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2563626309.webp
         * medium : https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2563626309.webp
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class PopularCommentsBean {
        /**
         * rating : {"max":5,"value":5,"min":0}
         * useful_count : 976
         * author : {"uid":"176122983","avatar":"https://img1.doubanio.com/icon/u176122983-29.jpg","signature":"","alt":"https://www.douban.com/people/176122983/","id":"176122983","name":"V."}
         * subject_id : 30135113
         * content : 如果开年的【15:17到巴黎】是一次失手的话，那么这部电影足以证明Eastwood宝刀未老。
         而且老爷子已经88岁了，怎么还有人要自作聪明的去教他如何拍电影?
         不排除这会是老爷子的谢幕之作了，各位且看且珍惜。
         * created_at : 2018-12-14 22:06:07
         * id : 1518702184
         */

        private RatingBeanX rating;
        private int useful_count;
        private AuthorBean author;
        private String subject_id;
        private String content;
        private String created_at;
        private String id;

        public RatingBeanX getRating() {
            return rating;
        }

        public void setRating(RatingBeanX rating) {
            this.rating = rating;
        }

        public int getUseful_count() {
            return useful_count;
        }

        public void setUseful_count(int useful_count) {
            this.useful_count = useful_count;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class RatingBeanX {
            /**
             * max : 5
             * value : 5
             * min : 0
             */

            private int max;
            private int value;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class AuthorBean {
            /**
             * uid : 176122983
             * avatar : https://img1.doubanio.com/icon/u176122983-29.jpg
             * signature :
             * alt : https://www.douban.com/people/176122983/
             * id : 176122983
             * name : V.
             */

            private String uid;
            private String avatar;
            private String signature;
            private String alt;
            private String id;
            private String name;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class WritersBean {
        /**
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1538557762.5.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1538557762.5.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1538557762.5.webp"}
         * name_en : Nick Schenk
         * name : 尼克·申克
         * alt : https://movie.douban.com/celebrity/1333973/
         * id : 1333973
         */

        private AvatarsBean avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1538557762.5.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1538557762.5.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1538557762.5.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class TrailersBean {
        /**
         * medium : https://img1.doubanio.com/img/trailer/medium/2566904868.jpg?
         * title : 中国预告片：自我救赎版 (中文字幕)
         * subject_id : 30135113
         * alt : https://movie.douban.com/trailer/251847/
         * small : https://img1.doubanio.com/img/trailer/small/2566904868.jpg?
         * resource_url : http://vt1.doubanio.com/201911131612/302b9c6ff82f3f151f10922409d21938/view/movie/M/302510847.mp4
         * id : 251847
         */

        private String medium;
        private String title;
        private String subject_id;
        private String alt;
        private String small;
        private String resource_url;
        private String id;

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getResource_url() {
            return resource_url;
        }

        public void setResource_url(String resource_url) {
            this.resource_url = resource_url;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class BloopersBean {
        /**
         * medium : https://img3.doubanio.com/img/trailer/medium/2566393215.jpg?
         * title : 花絮：导演特辑
         * subject_id : 30135113
         * alt : https://movie.douban.com/trailer/251662/
         * small : https://img3.doubanio.com/img/trailer/small/2566393215.jpg?
         * resource_url : http://vt1.doubanio.com/201911131612/4840a55bba51ba5e6cd39b37b4930f66/view/movie/M/302510662.mp4
         * id : 251662
         */

        private String medium;
        private String title;
        private String subject_id;
        private String alt;
        private String small;
        private String resource_url;
        private String id;

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getResource_url() {
            return resource_url;
        }

        public void setResource_url(String resource_url) {
            this.resource_url = resource_url;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class CastsBean {
        /**
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp"}
         * name_en : Clint Eastwood
         * name : 克林特·伊斯特伍德
         * alt : https://movie.douban.com/celebrity/1054436/
         * id : 1054436
         */

        private AvatarsBeanX avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBeanX getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBeanX avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBeanX {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class PhotosBean {
        /**
         * thumb : https://img1.doubanio.com/view/photo/m/public/p2553836098.webp
         * image : https://img1.doubanio.com/view/photo/l/public/p2553836098.webp
         * cover : https://img1.doubanio.com/view/photo/sqs/public/p2553836098.webp
         * alt : https://movie.douban.com/photos/photo/2553836098/
         * id : 2553836098
         * icon : https://img1.doubanio.com/view/photo/s/public/p2553836098.webp
         */

        private String thumb;
        private String image;
        private String cover;
        private String alt;
        private String id;
        private String icon;

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class ClipsBean {
        /**
         * medium : https://img1.doubanio.com/img/trailer/medium/2566997958.jpg?
         * title : 片段 (中文字幕)
         * subject_id : 30135113
         * alt : https://movie.douban.com/trailer/251879/
         * small : https://img1.doubanio.com/img/trailer/small/2566997958.jpg?
         * resource_url : http://vt1.doubanio.com/201911131612/ca89e42f8be32f21620a5785f7617bf0/view/movie/M/302510879.mp4
         * id : 251879
         */

        private String medium;
        private String title;
        private String subject_id;
        private String alt;
        private String small;
        private String resource_url;
        private String id;

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getResource_url() {
            return resource_url;
        }

        public void setResource_url(String resource_url) {
            this.resource_url = resource_url;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class DirectorsBean {
        /**
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp"}
         * name_en : Clint Eastwood
         * name : 克林特·伊斯特伍德
         * alt : https://movie.douban.com/celebrity/1054436/
         * id : 1054436
         */

        private AvatarsBeanXX avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBeanXX getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBeanXX avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBeanXX {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1515234371.83.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class PopularReviewsBean {
        /**
         * rating : {"max":5,"value":4,"min":0}
         * title : 88岁的伊斯特伍德说，即便当毒贩，他也要干的比年轻人更好
         * subject_id : 30135113
         * author : {"uid":"colinpark","avatar":"https://img3.doubanio.com/icon/u49097402-173.jpg","signature":"The Great Clown Pagliacci","alt":"https://www.douban.com/people/colinpark/","id":"49097402","name":"西帕克"}
         * summary : 文_西帕克 2011年10月，在密歇根州警和DEA（美国缉毒署）的一次联合行动中，逮捕了一个不寻常的毒贩。87岁的里奥·厄尔·夏普（Leo Earl Sharp Sr.），因持有200磅可卡因而被逮捕。夏普是专门为黑帮运送毒品的“...
         * alt : https://movie.douban.com/review/10079690/
         * id : 10079690
         */

        private RatingBeanXX rating;
        private String title;
        private String subject_id;
        private AuthorBeanX author;
        private String summary;
        private String alt;
        private String id;

        public RatingBeanXX getRating() {
            return rating;
        }

        public void setRating(RatingBeanXX rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public AuthorBeanX getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBeanX author) {
            this.author = author;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class RatingBeanXX {
            /**
             * max : 5
             * value : 4
             * min : 0
             */

            private int max;
            private int value;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class AuthorBeanX {
            /**
             * uid : colinpark
             * avatar : https://img3.doubanio.com/icon/u49097402-173.jpg
             * signature : The Great Clown Pagliacci
             * alt : https://www.douban.com/people/colinpark/
             * id : 49097402
             * name : 西帕克
             */

            private String uid;
            private String avatar;
            private String signature;
            private String alt;
            private String id;
            private String name;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
