import React, { Component } from "react";
import Post from "./Post"; // the model

class Posts extends Component {
	constructor(props) {
		super(props);
		this.state = {
			posts: [],
		};
	}

	loadPosts = () => {
		fetch("https://jsonplaceholder.typicode.com/posts")
			.then((response) => response.json())
			.then((data) => {
				const postList = data.map(
					(item) => new Post(item.id, item.title, item.body)
				);
				this.setState({ posts: postList });
			})
			.catch((error) => {
				console.error("Error fetching posts:", error);
				alert("Error loading posts.");
			});
	};

	componentDidMount() {
		this.loadPosts();
	}

	componentDidCatch(error, info) {
		alert("An error occurred: " + error);
		console.error("Error caught in component:", error, info);
	}

	render() {
		return (
			<div style={{ padding: "10px" }}>
				<h1>Blog Application</h1>
				<h2>All Blog Posts</h2>
				{this.state.posts.map((post) => (
					<div key={post.id}>
						<h3>{post.title}</h3>
						<p>{post.body}</p>
					</div>
				))}
			</div>
		);
	}
}

export default Posts;
