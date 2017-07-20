<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="tm-contact-page">
	<div class="row">
		<div class="col-xs-12">
			<div class="tm-flex tm-contact-container">
				<div
					class="tm-bg-white-translucent text-xs-left tm-textbox tm-2-col-textbox-2 tm-textbox-padding tm-textbox-padding-contact">
					<h2 class="tm-contact-info">留言</h2>

					<!-- contact form -->
					<form id="mess" name="mess"
						action="/psychology_train/mess/insert.do" method="post"
						class="tm-contact-form">

						<div class="form-group">
							<input type="text" id="reserveName" name="reserveName"
								class="form-control" placeholder="姓名" required />
						</div>
						<div class="form-group">
							<input type="text" class="form-control" id="phone"
								placeholder="电话" name="phone">
						</div>

						<div class="form-group">
							<input type="email" id="email" name="email"
								class="form-control" placeholder="Email" />
						</div>

						<div class="form-group">
							<textarea id="message" name="message"
								class="form-control" rows="5" placeholder="内容" required></textarea>
						</div>

						<button type="submit" class="pull-xs-right tm-submit-btn">提交</button>

					</form>
				</div>

				<div
					class="tm-bg-white-translucent text-xs-left tm-textbox tm-2-col-textbox-2 tm-textbox-padding tm-textbox-padding-contact">
					<h2 class="tm-contact-info">中国科学院心理教育机构合作中心</h2>
					<!-- google map goes here -->

				</div>

			</div>

		</div>

	</div>

</div>
