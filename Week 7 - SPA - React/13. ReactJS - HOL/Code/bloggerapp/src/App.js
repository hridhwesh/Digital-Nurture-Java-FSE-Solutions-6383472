import React from "react";

export const books = [
	{ id: 101, bname: "Master React", price: 670 },
	{ id: 102, bname: "Deep Dive into Angular 11", price: 800 },
	{ id: 103, bname: "Mongo Essentials", price: 450 },
];

export const courses = [
	{ id: 101, cname: "Angular", date: "4/5/2021" },
	{ id: 102, cname: "React", date: "6/3/2021" },
];

export const blogs = [
	{
		id: 101,
		blogName: "React Learning",
		author: "Stephen Biz",
		text: "Welcome to learning React",
	},
	{
		id: 102,
		blogName: "Installation",
		author: "Schewzdenier",
		text: "You can install React from npm",
	},
];

function App() {
	const bookDetails = (
		<ul>
			{books.map((book) => (
				<li key={book.id}>
					<h3>{book.bname}</h3>
					<h4>{book.price}</h4>
				</li>
			))}
		</ul>
	);

	const courseDetails = (
		<ul>
			{courses.map((course) => (
				<li key={course.id}>
					<h3>{course.cname}</h3>
					<p>{course.date}</p>
				</li>
			))}
		</ul>
	);

	const blogDetails = (
		<ul>
			{blogs.map((blog) => (
				<li key={blog.id}>
					<h3>{blog.blogName}</h3>
					<p>
						<strong>{blog.author}</strong>
					</p>
					<p>{blog.text}</p>
				</li>
			))}
		</ul>
	);

	return (
		<div
			style={{
				display: "flex",
				paddingTop: "150px",
				justifyContent: "center",
			}}>
			<div style={{ padding: "0 20px" }}>
				<h1>Course Details</h1>
				{courseDetails}
			</div>

			<div style={{ width: "5px", backgroundColor: "green" }}></div>

			<div style={{ padding: "0 40px" }}>
				<h1 style={{ marginLeft: "25px" }}>Book Details</h1>
				{bookDetails}
			</div>

			<div style={{ width: "5px", backgroundColor: "green" }}></div>

			<div style={{ padding: "0 40px" }}>
				<h1 style={{ marginLeft: "25px" }}>Blog Details</h1>
				{blogDetails}
			</div>
		</div>
	);
}

export default App;
