// import 'antd/lib/index.css';

export function fetchJson(url, method) {
  return new Promise((resolve, reject) => {
    fetch(url, {
      method: 'get',
      mode: 'no-cors'
    }).then(res => {
      console.log('res:', res);
      if (res.ok) {
        res.json().then(data => {
          resolve(data);
        })
      } else {
        reject(new Error('Request Error :', url));
      }
    })
  });
}
