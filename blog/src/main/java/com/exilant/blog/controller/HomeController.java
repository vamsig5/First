package com.exilant.blog.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exilant.blog.forms.LoginForm;
import com.exilant.blog.forms.RegisterForm;
import com.exilant.blog.model.Post;
import com.exilant.blog.model.User;
import com.exilant.blog.services.LoginService;
import com.exilant.blog.services.NotificationService;
import com.exilant.blog.services.PostService;
import com.exilant.blog.services.RegistrationService;

@Controller
public class HomeController {
	
	@Autowired
	private NotificationService notify;
	
	@Autowired
	private LoginService login;
	
	@Autowired
	private RegistrationService register;

	@Autowired
	private PostService postService;
	@RequestMapping("/")
	public String index(Model model) {
	List<Post> latest5Posts = postService.findLatest5Posts();
	model.addAttribute("latest5posts", latest5Posts);
	List<Post> latest3Posts = latest5Posts.stream()
	.limit(3).collect(Collectors.toList());
	model.addAttribute("latest3posts", latest3Posts);
	return "bg";
    }
	
	 @RequestMapping("/posts/view/{id}")
	    public String view(@PathVariable("id") Long id, Model model) {
	        Post post = postService.findById(id);
	        if (post == null) {
                notify.addErrorMessage("Cannot find post #" + id);
                return "redirect:/";
            }
	        model.addAttribute("post", post);
	        return "posts/view";
	    }
	 
	 @RequestMapping(value = "/user/login")
	    public String loginPage(@Valid LoginForm loginForm, BindingResult bindingResult) {
	        if (bindingResult.hasErrors()) {
	             notify.addErrorMessage("Please fill the form correctly!");
	             return "user/login";
	        }

	        if (!login.authenticate(
	             loginForm.getUsername(), loginForm.getPassword())) {
	             notify.addErrorMessage("Invalid login!");
	             return "user/login";
	        }

	        notify.addInfoMessage("Login successful");
	        return "redirect:/";
	    }
	 @RequestMapping(value = "/user/register")
	    public String registerPage(@Valid RegisterForm form, BindingResult bindingResult) {
		 if (bindingResult.hasErrors()) {
             notify.addErrorMessage("Please fill the form correctly!");
             return "user/register";
        }	
		 User user=new User(form.getId(),form.getUsername(),form.getFullName(),form.getMobile(),form.getPassword());
		String s= register.register(user);	
		System.out.println(s);
		 if(s!=null) {
		 return "redirect:/";
		 }
	 return "user/register";
	 }
	 @RequestMapping(value="/post/create")
	 public @ResponseBody Post createPost(@RequestBody Post post) {
		Post p=  postService.create(post);
		  return p;
	 }
	}

