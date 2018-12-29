package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.entity.User;
import com.service.service;

@Controller
@SessionAttributes(value="user",types=User.class)
public class UserController {
				@Autowired
				private service si;
				@RequestMapping(value="login",method=RequestMethod.GET)
				public String login(String uname, String upwd, Model model){
					User user = si.findUser(uname, upwd);
					model.addAttribute("user",user);
					if(user != null){
						return "redirect:fenye";
					}else{
						User user1 = si.findUser(uname, upwd);
						model.addAttribute("user",user1);
						return "index";
					}
					
					
				}
				
				@RequestMapping(value="zhuce",method=RequestMethod.POST)
				public String zhuce(User u,Model model){
					int us = si.insert(u);
					model.addAttribute("us",us);
					return "zcsuccess";
					
				}
				@RequestMapping(value="fenye",method=RequestMethod.GET)
				public String fenye(Integer dqy,Model model){
					if(dqy == null){
						dqy =1;
					}
						Integer pagesize=3;
						Integer currNo = (dqy-1)*pagesize;
						int totalcount = si.count();
						int totalpages=totalcount%pagesize==0?
								totalcount/pagesize:
									(totalcount/pagesize)+1;
						List<User> a = si.page(pagesize, currNo);
						model.addAttribute("a",a);
						model.addAttribute("totalPages",totalpages);
						model.addAttribute("dqy",dqy);
						return "success";
					
				}
				@RequestMapping(value="updateaa",method=RequestMethod.GET)
				public String updateaa(int uid,Model model){
					User li = si.selone(uid);
					model.addAttribute("li", li);
					return "updatepage";
					
				}
				
				@RequestMapping(value="update",method=RequestMethod.POST)
				public String update(User u,Model model){
					int up = si.update(u);
					model.addAttribute("up",up);
					return "redirect:fenye";
				}
				
				@RequestMapping(value="delete",method=RequestMethod.GET)
				public String delete(User u,Model model){
					int de = si.delete(u);
					model.addAttribute("de",de);
					return "redirect:fenye";
				}
				
			
				
}
