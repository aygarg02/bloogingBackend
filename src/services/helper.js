import axios from "axios";
export const Base_Url='http://localhost:8080'
export const Myaxios=axios.create({baseURL:Base_Url});