$(document).ready(function(){
	getCourseInfo();
	$('.top').click(function(event) {
		$('html,body').animate({scrollTop:0}, 400);
	});

	$(window).scroll(function(event) {
		if($(window).scrollTop() > 500){
			$('.top').fadeIn('400');
		}
		else{
			$('.top').fadeOut('400');
		}
	});
});


function getCourseInfo() {
	$('.course-fangxiang li').click(function() {
		$(this).addClass('li-all').siblings().removeClass('li-all');
		$(this).find('a').addClass('li-all-a');
		$(this).siblings().find('a').removeClass('li-all-a');
	});
	 $('.course-fangxiang li').click(function() {
	 	var first = $('.first .li-all').find('a').text();
		var second = $('.secrd .li-all').find('a').text();
		var third = $('.third.li-all').find('a').text();
	 	$.post("queryCourse.action",
	 		{
	 			course_direction:  first,
				course_classification:  second,
				course_rank: third
			}, function(data){
				var str = "";
				$.each(JSON.parse(data), function(i, item){
	 				str += 
	 				' <li class="col-md-3"><a href="javascriptvoid(0)">'+
					'<img src=imgs/'+item.course_id+'.jpg + alt="">'+	
					'<h4>'+item.course_name+'</h4>'+
					'<p>'+item.course_description+'</p>'+
					'<span>'+item.course_progress+'</span>'+
					'<span>'+item.course_studyNum+'在学习</span>'+
                	'<span class="tip">'+item.course_studyTime+'+'+item.course_rank+'</span>'+
                	'</a></li>';
					/* li+
						div+item.course_studyTime+  + item.course_studyTime +div+
						a href='javascriptvoid(0);'img src='imgs+item.course_id+.jpg' +
							h3+item.course_name+h3+
 			    			p+item.course_description+p+
							span+item.course_progress+span&nbsp;&nbsp;&nbsp;&nbsp;span+item.course_studyNum+浜哄湪瀛︿範span+
	 				 	a+
					 li;*/
				});
				$('.courses ul').html(str);
			});
	 });
}