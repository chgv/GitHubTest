<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

	<head>
		<%@ include file="/back_web/commonCSS.file" %> <!-- 基本CSS檔案 -->
	</head>

	<body>
		<%@ include file="/back_web/loading.file" %> <!-- loading -->
		<%@ include file="/back_web/header.file" %> <!-- Header -->
		<%@ include file="/back_web/sidebar.file" %> <!-- sidebar -->

		<div class="main-content">

<!-- 		● 你的內容寫在main-content這個div內 ，以下到191行刪除-->

			<h2>★ 色碼</h2>
			<span class="btn btn-square" style="background: #30504F;color: #FFF">#30504F</span>
			<span class="btn btn-square" style="background: #996A4D;color: #FFF">#996A4D</span>
			<span class="btn btn-square" style="background: #B38C61;color: #FFF">#B38C61</span>
			<span class="btn btn-square" style="background: #E4D6C4;color: #FFF">#E4D6C4</span>
			<span class="btn btn-square" style="background: #F7F6F2;color: #999">#F7F6F2</span>
			<span class="btn btn-square" style="background: #8FC2C2;color: #FFF">#8FC2C2</span>
			<span class="btn btn-square" style="background: #D1E6E6;color: #999">#D1E6E6</span>

			<hr><br><br>

			<h2>★ button</h2>
			<h3>至少要加上兩個class名稱，要什麼就直接複製去用</h3>
			<button type="button" class="btn btn-secondary">取消</button>
			<button type="button" class="btn btn-primary">確定</button>

			<hr><br>

			<h3>普通版</h3>
			<button type="button" class="btn btn-primary">primary</button>
			<button type="button" class="btn btn-secondary">secondary</button>
			<button type="button" class="btn btn-success">success</button>
			<button type="button" class="btn btn-danger">danger</button>
			<button type="button" class="btn btn-warning">warning</button>
			<button type="button" class="btn btn-info">info</button>
			<button type="button" class="btn btn-light">light</button>
			<button type="button" class="btn btn-dark">dark</button>

			<hr><br>

			<h3>淺色版</h3>
			<button type="button" class="btn light btn-primary">primary</button>
			<button type="button" class="btn light btn-secondary">secondary</button>
			<button type="button" class="btn light btn-success">success</button>
			<button type="button" class="btn light btn-danger">danger</button>
			<button type="button" class="btn light btn-warning">warning</button>
			<button type="button" class="btn light btn-info">info</button>
			<button type="button" class="btn light btn-light">light</button>
			<button type="button" class="btn light btn-dark">dark</button>

			<hr><br>

			<h3>按鈕尺寸：加尺寸的class</h3>
			<button type="button" class="btn btn-primary btn-lg">btn-lg</button>
			<button type="button" class="btn btn-primary">預設</button>
			<button type="button" class="btn btn-primary btn-sm">btn-sm</button>
			<button type="button" class="btn btn-primary btn-xs">btn-xs</button>
			<button type="button" class="btn btn-primary btn-xxs">btn-xxs</button>

			<hr><br>

			<h3>方按鈕：加btn-square</h3>
			<button type="button" class="btn btn-square btn-primary">primary</button>
			<button type="button" class="btn btn-square btn-secondary">secondary</button>
			<button type="button" class="btn btn-square btn-success">success</button>
			<button type="button" class="btn btn-square btn-danger">danger</button>
			<button type="button" class="btn btn-square btn-warning">warning</button>
			<button type="button" class="btn btn-square btn-info">info</button>
			<button type="button" class="btn btn-square btn-light">light</button>
			<button type="button" class="btn btn-square btn-dark">dark</button>

			<hr><br>

			<h3>右邊icon</h3>
			<button type="button" class="btn btn-primary">Add to cart <span class="btn-icon-end">
					<i class='bx bxs-cart'></i></span>
			</button>
			<button type="button" class="btn btn-info">Add to wishlist <span class="btn-icon-end">
					<i class='bx bxs-cart'></i></span>
			</button>
			<button type="button" class="btn btn-danger">Remove <span class="btn-icon-end">
					<i class='bx bxs-cart'></i></span>
			</button>
			<button type="button" class="btn btn-secondary">Sent message <span class="btn-icon-end">
					<i class='bx bxs-cart'></i></span>
			</button>
			<button type="button" class="btn btn-warning">Add bookmark <span class="btn-icon-end">
					<i class='bx bxs-cart'></i></span>
			</button>
			<button type="button" class="btn btn-success">Success <span class="btn-icon-end">
					<i class='bx bxs-cart'></i></span>
			</button>

			<hr><br>

			<h3>左邊icon</h3>
			<button type="button" class="btn btn-rounded btn-primary"><span
					class="btn-icon-start text-primary"><i class='bx bxs-cart'></i>
				</span>Buy</button>
			<button type="button" class="btn btn-rounded btn-info"><span class="btn-icon-start text-info"><i
						class='bx bx-plus'></i>
				</span>Add</button>
			<button type="button" class="btn btn-rounded btn-danger"><span
					class="btn-icon-start text-danger"><i class='bx bx-mail-send'></i>
				</span>Email</button>
			<button type="button" class="btn btn-rounded btn-secondary"><span
					class="btn-icon-start text-secondary"><i class='bx bxs-share'></i>
				</span>Share</button>
			<button type="button" class="btn btn-rounded btn-warning"><span
					class="btn-icon-start text-warning"><i class='bx bx-download'></i>
				</span>Download</button>
			<button type="button" class="btn btn-rounded btn-success"><span
					class="btn-icon-start text-success"><i class='bx bx-upload'></i>
				</span>Upload</button>

			<hr><br><br>

			<h2>★ 跳窗</h2>
			<a href="https://bootstrap5.hexschool.com/docs/5.0/components/modal/">
				<h3 style="color:red">其他種請看這</h3>
			</a>

			<!-- Button trigger modal -->
			<button type="button" class="btn btn-warning btn-square" data-bs-toggle="modal" data-bs-target="#exampleModal">
				修改
			</button>

			<!-- Modal -->
			<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<h3 class="modal-title" id="exampleModalLabel">修改員工資料</h3>
							<button type="button" class="btn-close" data-bs-dismiss="modal"
								aria-label="Close"></button>
						</div>
						<div class="modal-body">
							內容內容內容內容內容內容內容內容內容內容內容內容內容內容內容
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">取消</button>
							<button type="button" class="btn btn-primary">儲存</button>
						</div>
					</div>
				</div>
			</div>

			<hr><br><br>

			<h2>★ table</h2>
			<h3>普通版：class="table"</h3>
			<table class="table">
				<tr>
					<th>#</th>
					<th>Name</th>
					<th>Date</th>
					<th>Price</th>
					<th>Status</th>
				</tr>
				<tr>
					<th>1</th>
					<td>Kolor Tea Shirt For Man</td>
					<td>January 22</td>
					<td class="color-primary">$21.56</td>
					<td><span class="badge badge-primary light">Sale</span></td>
				</tr>
				<tr>
					<th>2</th>
					<td>Kolor Tea Shirt For Women</td>
					<td>January 30</td>
					<td class="color-success">$55.32</td>
					<td><span class="badge badge-success">Tax</span></td>
				</tr>
				<tr>
					<th>3</th>
					<td>Blue Backpack For Baby</td>
					<td>January 25</td>
					<td class="color-danger">$14.85</td>
					<td><span class="badge badge-danger">Extended</span></td>
				</tr>
			</table>

<!-- 		刪到這裡		 -->

		</div>


		<%@ include file="/back_web/commonJS.file" %> <!-- 基本JS檔案 -->
		<script>
// 			● 可在這更改這一頁header的標題，不寫也可以，但請變成空字串 
			$("#pagename").text("MEMORY 後台管理");
		</script>
	</body>
</html>