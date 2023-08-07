import http from './axios-common';

export function getAllParties(){
    return http.get("/Party");
}